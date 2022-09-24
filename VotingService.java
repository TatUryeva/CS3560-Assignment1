
public class VotingService 
{
	//private Question question;
	private QuestionInterface question;
	private Student[] students;
	private boolean[][] responses;
	//private String[] submissions;
	
	public VotingService(QuestionInterface quest, Student[] studs)
	{
		question = quest;
		students = studs;
		responses = new boolean[students.length][question.getNumOptions()];
		//submissions = new String[students.length];
	}
	
	/*
	private boolean hasSubmitted(Student s)
	{
		for(int i = 0; i < students.length; i++)
		{
			if(s.getID().equals(submissions[i]))
			{
				return true;
			}
			else if(submissions[i] == null)
			{
				submissions[i] = s.getID();
				return false;
			}			
		}
		return false;
	}
	*/
	
	/*
	public void acceptResponse(Student s, int studentNum)
	{
		responses[studentNum] = s.submitResponse();
		if(hasSubmitted(s))
		{
			responses[studentNum] = s.getResponse();
		}
	}
	*/
	
	// retrieves responses from students
	public void acceptResponses()
	{
		for(int i = 0; i < students.length; i++)
		{
			responses[i] = students[i].submitResponse();
		}
	}
	
	// calculates and prints question statistics
	public void printStatistics()
	{
		int[] stats = new int[question.getNumOptions()];
		for(int i = 0; i < question.getNumOptions(); i++)
		{
			for(int j = 0; j < students.length; j++)
			{
				if(responses[j][i])
				{
					stats[i]++;
				}
			}
			System.out.println((char)(65+i) + ": " + stats[i]);
		}
	}
	
	public void printResponses() // mainly for debugging, but also for demo
	{
		for(int i = 0; i < students.length; i++)
		{
			System.out.print("Student" + students[i].getID() + " response: ");
			for(int j = 0; j < question.getNumOptions(); j++)
			{
				if(responses[i][j])
				{
					System.out.print((char)(65+j) + " ");
				}
			}
			System.out.println();
		}
	}
}
