
public class MultipleChoiceQuestion implements QuestionInterface
{	
	private int numOptions;
	
	public MultipleChoiceQuestion(int nOpts)
	{
		numOptions = nOpts;
	}
	
	// generates answer with multiple randomly selected options
	public boolean[] generateAnswer()
	{
		boolean[] answer = new boolean[numOptions];
		int r = 0;
		for(int i = 0; i < answer.length; i++)
		{
			r = (int)Math.round(Math.random());
			if(r == 1)
			{
				answer[i] = true;
			}
		}
		
		return answer;
	}
	
	public int getNumOptions()
	{
		return numOptions;
	}
}
