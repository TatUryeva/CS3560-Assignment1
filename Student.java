
public class Student 
{
	private String ID;
	//Question question;
	QuestionInterface question;
	private boolean[] response;
	
	public Student(String id, QuestionInterface quest)
	{
		ID = id;
		question = quest;
		response = new boolean[question.getNumOptions()];
	}
	
	// generates random answer
	public void generateResponse()
	{
		response = question.generateAnswer();
		//printResponse();
	}
	
	// returns student's response
	public boolean[] submitResponse()
	{
		return response;
	}
	
	public String getID()
	{
		return ID;
	}
	
	// prints student's response
	public void printResponse() // for debugging
	{
		for(int i = 0; i < response.length; i++)
		{
			System.out.print(response[i]+", ");			
		}
		System.out.println();
		System.out.println();
	}
}
