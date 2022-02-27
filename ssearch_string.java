public class ssearch_string {
    public static void main(String[] args) {
        String name="chirangan";
        char target='n';
        System.out.println(search(name,target));
    }
        static boolean search(String str,char target){
            for (int i=0;i<str.length();i++){
                if(target==str.charAt(i)){
                    return i;
                     return true;

                }
                else{
                     return false;

                }
            }
            
        }
    
    
}
