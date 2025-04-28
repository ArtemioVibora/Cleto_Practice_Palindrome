public class Palindrome
{
    public static boolean checkPalindrome(String str)
    {
        int tracker = 0;
        char[] stringArr = str.toCharArray();
        char[] reverseArr = new char[str.length()];
        for (int i = str.length() - 1; i >= 0; i--)
        {
            reverseArr[tracker] = stringArr[i];
            tracker++;
        }

        for (int i = 0; i < str.length(); i++)
        {
            if (reverseArr[i] != stringArr[i])
            {
                return false;
            }
        }

        return true;

    }
    public static void main(String args[])
    {

        boolean isPalindrome = checkPalindrome(args[0]); 
        
        if (isPalindrome)
        {
            System.out.println("It is a palindrome");
        }

        {
            System.out.println("It is not a palindrome");
        }
    }

}
