import java.util.*;
@SuppressWarnings("resource")

public class ecoo20p1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        sc.nextLine();

        String[] notes = {"C", "C#", "D", "D#", "E", "F", "F#", "G", "G#", "A", "A#", "B", "C", "C#", "D", "D#", "E", "F", "F#", "G", "G#", "A", "A#", "B"};

        Boolean check;
        for(int i = 0; i < T; i++){
            check = false;
            String s = sc.nextLine();

            String[] chord = s.split(" ");

            for(int k = 0; k < 12 ; k++){
                if(chord[0].equals(notes[k]) && chord[1].equals(notes[k+4]) && chord[2].equals(notes[k+7]) && chord[3].equals(notes[k+10])){
                    System.out.println("root");
                    check = true;
                }else if(chord[1].equals(notes[k]) && chord[2].equals(notes[k+4]) && chord[3].equals(notes[k+7]) && chord[0].equals(notes[k+10])){
                    System.out.println("third");
                    check = true;
                }else if(chord[2].equals(notes[k]) && chord[3].equals(notes[k+4]) && chord[0].equals(notes[k+7]) && chord[1].equals(notes[k+10])){
                    System.out.println("second");
                    check = true;
                }else if(chord[3].equals(notes[k]) && chord[0].equals(notes[k+4]) && chord[1].equals(notes[k+7]) && chord[2].equals(notes[k+10])){
                    System.out.println("first");
                    check = true;
                }
            }

            if(!check){
                System.out.println("invalid");
            }

        }
    }
}