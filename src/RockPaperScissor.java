import java.util.Random;

//this class will work as backend
public class RockPaperScissor {
    //all the choices that a computer can choose
    private static final String[] computerChoices = {"Rock", "Paper", "Scissors"};

    public String getComputerChoice(){
       return computerChoice;
//        String[] choices = {"Rock", "Paper", "Scissors"};
//        int randomIndex = (int) (Math.random() * choices.length);
//        return choices[randomIndex];
    }

    public int getComputerScore(){
        return computerScore;
    }

    public int getPlayerScore(){
        return playerScore;
    }

    //store the computer choice so that we can retrieve the value and display is to the frontend
    private String computerChoice;

    //store the scores so that we can retrieve the value and display is to the frontend
    private int computerScore, playerScore;

    //use to generate a random number to randomly choose an option for the computer
    private final Random random;

    //constructor to initialize random object
    public RockPaperScissor(){
        random = new Random();
    }

    //call this method to begin playing rock paper scissor
    //playerChoice is the choice made by the player
    //this method will return the result of the game
    public String playRockPaperScissor(String playerChoice){
        //generate computer choice
        computerChoice = computerChoices[random.nextInt(computerChoices.length)];

        //will contain the returning message indicating the result of the game
        String result;

        //evaluate the winner
        if(computerChoice.equals("Rock")){
            if(playerChoice.equals("Paper")){
                result = "Player Wins";
                playerScore++;
            }else if(playerChoice.equals("Scissors")) {
                result = "Computer Wins";
                computerScore++;
            }else{
                result = "Draw";
            }
        }else if(computerChoice.equals("Paper")){
            if(playerChoice.equals("Scissors")){
                result = "Player Wins";
                playerScore++;
            }else if(playerChoice.equals("Rock")) {
                result = "Computer Wins";
                computerScore++;
            }else{
                result = "Draw";
            }
        }else{
            if(playerChoice.equals("Rock")){
                result = "Player Wins";
                playerScore++;
            }else if(playerChoice.equals("Paper")) {
                result = "Computer Wins";
                computerScore++;
            }else{
                result = "Draw";
            }
        }
        return result;
    }
}
