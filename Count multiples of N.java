static int countMultiples(int N)
    {
       //  your code here
       int count =0 ;
       int i;
       for(i=1 ;i<=100 ;i++)
       if(i%N==0)
        count++;
return count;
    }