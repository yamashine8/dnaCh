public class Main {
    public static boolean dnaC(String dna) {
        for (int i = 0; i < dna.length(); i++) {
            char c = dna.charAt(i);
            if (c != 'A' && c != 'T' && c != 'C' && c != 'G') {
                return false;
            }
        }
        return true;

    }
    public static String exC(String dna){
        String temp="";
        for (int i = 0; i < dna.length(); i++) {
            char c = dna.charAt(i);
            if (c == 'A'){
                temp += "T";
            } else if (c == 'T') {
                temp += "A";
            } else if (c == 'C') {
                temp += "G";
            } else {
                temp += "C";
            }
        }
        return temp;
    }
    public static boolean cl(String dna){
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < dna.length(); i++) {
            char c = dna.charAt(i);
            if (c == 'A'){
                temp.append('T');
            } else if (c == 'T') {
                temp.append('A');
            } else if (c == 'C') {
                temp.append('G');
            } else {
                temp.append('C');
            }
        }
        String tempC = temp.reverse().toString();
        return dna.equals(tempC);
    }
    public static void main(String[] args) {
        String dna = "AATT";
        System.out.println(dnaC(dna));
        System.out.println(exC(dna));
        System.out.println(cl(dna));
    }
}