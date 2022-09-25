
public class SimulationDriver 
{

	public static void main(String[] args) 
	{
		QuestionInterface q = new MultipleChoiceQuestion(8); // configures the question type
		Student[] s = new Student[5];
		VotingService vs = new VotingService(q, s);	// configures voting service
		
		for(int i = 0; i < s.length; i++) // generates students
		{
			s[i] = new Student(i+"", q);
			s[i].generateResponse();
		}
		vs.acceptResponses();
		vs.printResponses();
		vs.printStatistics();		
		
		int r = 0;
		for(int i = 0; i < s.length; i++)
		{
			r = (int)Math.round(Math.random());
			if(r == 1)
			{
				s[i].generateResponse();
			}
		}
		
		vs.acceptResponses();
		vs.printResponses(); 
		vs.printStatistics();
	}

}
