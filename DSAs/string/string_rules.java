class string_rules{
public static void main(String args[]){
   String str1="manish";
   String str2=new String("manish");
   if(str1==str2)
       System.out.println("Equal");
   else 
   System.out.println("Not Equal");
// Not Equal


String str3="manish";
if(str1==str3)
       System.out.println("Equal");
   else 
   System.out.println("Not Equal");
   //Equal because both refrences are pointing to same value in a dtring pool
//   if we want to compare the strings by value then we have to use a library function called equals .

if(str1.equals(str2)) //equalsIgnoreCase
System.out.println("Equal");
else
System.out.println("Not equal");
// 
}
};