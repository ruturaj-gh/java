import java.util.HashSet;

/**
 * trytrashjava
 */
public class trytrashjava {

    public static void main(String[] args) {
        String str="GHAAJJ";
        System.out.println(fun(str));
        char newstr[]=str.toCharArray();
        System.out.println(firstRepeating(newstr));
        //fun2(str, 0);
        
    }
    static  char fun(String str){
        
        char charact='0';
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)){
                 charact=str.charAt(i);
                 
                 
                    
                }
                if(charact!='0'){
                    break;
                }
                
                
            }
            
        }
        return charact;


    }
    static void fun2(String str,int i){
        int j=i+1;
        final char tt;
        
        if(i==str.length()){        
            return;
        }
        for(j=i+1 ; j<str.length();j++){
            if(str.charAt(j)==str.charAt(i)){
               
                tt=str.charAt(j);
                System.out.println(tt);
                
                break;
     
            }

        }

        
        fun2(str, i+1);
        
        


    }
    static char firstRepeating(char str[])
    {
        // Creates an empty hashset
        HashSet<Character> h = new HashSet<>();
 
        // Traverse the input array from left to right
        for (int i=0; i<=str.length-1; i++)
        {
            char c = str[i];
 
            // If element is already in hash set, update x
            // and then break
            if (h.contains(c))
                return c;
 
            else // Else add element to hash set
                h.add(c);
        }
 
        return '\0';
    }
 
}