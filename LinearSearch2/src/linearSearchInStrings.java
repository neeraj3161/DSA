public class linearSearchInStrings {
    public static void main(String[] args) {
        String name = "Neeraj";
        char target ='a';
        System.out.println(searchStrings(name,target));

    }

    static int searchStrings(String name,char target)
    {
        if(name.length()==0){
            return -1;
        }

        for(char ch:name.toCharArray()){
            if(ch==target){
                return name.indexOf(ch);
            }
        }
        return -1;
    }
}
