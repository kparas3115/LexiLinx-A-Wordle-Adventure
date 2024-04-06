import java.util.ArrayList;
public class wordle_logic {

        static int wordsize;

        static ArrayList<String> answer=new ArrayList<>();
        wordle_logic(){
            answer.add("f");
            answer.add("a");
            answer.add("r");
            answer.add("m");

            wordsize= answer.size();


        }

        static boolean matchexactletter(int i)
        {
            if(wordle_main.arr.get(i).getText().equals(answer.get(i))){
                return true;
            }
            return false;
        }
        static boolean containsletter(int i)
        {
            if(answer.contains(wordle_main.arr.get(i).getText()))
            {
                return true;
            }
            return false;
        }


    }
