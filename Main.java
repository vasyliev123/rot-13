public class Main {
    public static void main(String[] args) {
        String text = args[0];

        StringBuilder res = new StringBuilder("");

        for(int i =0;i<text.length();i++)
        {
            if(text.charAt(i)<97||text.charAt(i)>122) {
                res.append(text.charAt(i));
                continue;
            }
            if(text.charAt(i)+13>122)
            {
                res.append((char)(text.charAt(i)+13-26));
            }
            else{
                res.append((char)(text.charAt(i)+13));
            }
        }
        System.out.println(res);
    }
}
