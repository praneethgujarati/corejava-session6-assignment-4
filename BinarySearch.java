public class BinarySearch
{
     public static void main(String args[])
     {
        int c, first,last,mid,n,search,array[];//variables declaread of type int
        System.out.print("Enter the no. of elements:");//prompts the user to enter the no. of elements
        n=Integer.parseInt(System.console().readLine());
        array = new int[n];
        System.out.println("Enter"  +  ""   +    +n   +  "" +  "  sorted elements:");
        for(c=0; c<n;c++)//This for loop is for the elements 
        array[c]=Integer.parseInt(System.console().readLine());
         System.out.println("Enter element to be searched:");
         search=Integer.parseInt(System.console().readLine());
         first=0;
         last=n-1;
         mid=(first+last)/2;
         while(first<=last)//This while loop checks the condition and gives the relevant output
         {
            if(array[mid]<search)
            {
              first = mid+1;
            }
            else if(array[mid]==search)
            {
               System.out.println("Element found:" +search);
               System.out.println("found at location" + (mid) + ".");
               break;
            }
            else
            {
               last=mid-1;
            }
              mid=(first+last)/2;
         }
             if(first>last)
               System.out.println("Element is not found in the list:" +search);
            
     }
}