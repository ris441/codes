// { Driver Code Starts
 
#include <bits/stdc++.h>
using namespace std;


 // } Driver Code Ends
//User function template for C++

int isPalindrome1(string S)
	{
	    // Your code goes here

       int s =0; int end = S.length()-1;
       int b=0;
       while(s<=end)
       {
           if(S[s]==S[end]){
               b=1;
               s++;
               end--;
           }
		   else
           return 0;
           
           
       }
       return b;


	}
	
	bool palin(string str , int s , int e){
    if(s>=e){
        return true;

    }
    
    else if(str[s]==str[e]){
        s++;
        e--;
       return  palin(str,s,e);
    }
	
	    return false;
	}
	int isPalindrome(string S)
	{
	    // Your code goes here
	    int start = 0; 
	    int end= S.length()-1;
	    int ans=palin(S,start,end);
	    return ans;
	}



// { Driver Code Starts.

int main() 
{
   	// ios_base::sync_with_stdio(0);
    // cin.tie(NULL);
    // cout.tie(NULL);
   
   	int t;
   	cin >> t;
   	while(t--)
   	{
   		string s;
   		cin >> s;

   	   // Solution ob;
		  int ans = isPalindrome1(s);
		  cout<<ans<<endl;

   		cout <<isPalindrome(s) << "\n";
   	}

    return 0;
}  // } Driver Code Ends