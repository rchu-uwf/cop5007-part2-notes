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
        for(int i=0; i < this.answer.length(); ++i) {
            if(Character.isDigit(this.answer.charAt(i)) ) {
                return true;
            }
        }
        return false;
    }

    public String getAnswerWithPlaceholders(){
        return "test";
    }

}
