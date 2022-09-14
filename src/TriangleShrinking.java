class Solution {
    // Triangle shrinking downwards
    static String triDownwards(String S){
   String str =" " ;
   for(int i=0;i<S.length();i++){
       for(int j =0;j<i;j++){
           str =str+" ";

       }
       str =str+S.substring(i,S.length());

   }
   return str;
        
    }
};



//        Geeks
//        .eeks
//        ..eks
//        ...ks
//        ....s