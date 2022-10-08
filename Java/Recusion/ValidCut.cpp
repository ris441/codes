#include<bits/stdc++.h>
using namespace std ;
#define ll long long
#define mod 1000000007
int maxthree(int ans1 , int ans2, int ans3){
        if(ans1>ans2&&ans2>ans3){
        return ans1;
    }
    else if (ans2>ans1&&ans1>ans3){
        return ans2;
    }
    return ans3;
}
int ValidCut(int n ,int a,int b ,int  c , int ans ){
    if(n==0){
        return ans ;
    }
    else if(n<0){return -1;}
    
    int ans1= ValidCut(n-a, a,b,c,ans++);
    int ans2=ValidCut(n-b,a,b,c,ans++);
    int ans3=ValidCut(n-c,a,b,c,ans++);
  return   maxthree(ans1,ans2,ans3);


//    if(ans<0){
//        return -1;

//    }
//    else {
//        return ans;
//    }
}

int ValidCut1(int n ,int a,int b ,int  c  ){
    if(n==0){
        return 0;
    }
    else if(n<0){return -1;}
    
    int ans1= ValidCut1(n-a, a,b,c);
    int ans2=ValidCut1(n-b,a,b,c);
    int ans3=ValidCut1(n-c,a,b,c);
   int ans =  maxthree(ans1,ans2,ans3);


   if(ans<0){
       return -1;

   }
   else {
       return ans+1;
   }
}
int main(){
    int l;
cout<<"Enter the Length of  hte Rope :";
cin>>l;
int a, b, c ;
cout<<"Enter a, b, c : ";
cin>>a>>b>>c;
int ans = ValidCut(l,a,b,c,0);
cout<<ans<<endl;
return 0;
}