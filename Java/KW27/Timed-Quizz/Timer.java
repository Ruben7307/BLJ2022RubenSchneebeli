package ch.noseryoung;

public class Timer extends Thread{
    private QuizManager manager;
    Timer(QuizManager manager){
        this.manager = manager;
    }
    @Override
    public void run(){
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
            }
            if (!manager.isQuestionAnswered()){
                Timer timer = new Timer(manager);
                manager.startTimer(timer);
                if (!(manager.getQuiz().getCurrentQuestionCount() == 2)){
                    manager.increaseQuestionCount();
                    manager.playQuiz();
                }else {
                    manager.finished();
                }

            }
    }


}
