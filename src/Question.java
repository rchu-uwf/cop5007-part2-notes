public class Question {

    private String text;
    private String answer;

    public Question(){

    }

    public Question(String q, String a) {
        this.text = q;
        this.answer = a;
    }

    public String getText() {
        return this.text;
    }

    public boolean answerContainsDigit() {
        for(int i; i < this.answer.length(); ++i) {
            if(this.answer.charAt(i) == digit) {
                return true;
            }
        }
        return false;
    }

    public String getAnswerWithPlaceholders(){
        return "test";
    }

}
