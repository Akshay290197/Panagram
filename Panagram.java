public class Panagram {
    public static void main(String[] args) {
        String str1 = "the quick brown fox jumps of over the lazy dog";
        Panagram panagram = new Panagram();
        System.out.println(panagram.isPanagram(str1.toLowerCase()));
    }

    public boolean isPanagram(String s){
        if(s.length()<26){
            return false;
        }
        else{
            for(char ch='a';ch <= 'z';ch++){
                if(s.indexOf(ch)<0){
                    return false;
                }
            }
        }
        return true;
    }
}
