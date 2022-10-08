#include<bits/stdc++.h>
using namespace std;
int max(int a,int b,int c){
    vector<int> v;
    v.push_back(a);
    v.push_back(b);
    v.push_back(c);
    sort(v.begin(),v.end());
    return v[2];
}
int fun(int n,int a,int b,int c){
    if(n==0)
    return 0;
    if(n<0)
    return -1;
    
   int val=fun(n-a,a,b,c);
   int val1=fun(n-b,a,b,c);
   int val2=fun(n-c,a,b,c);
   int ans=max(val,val1,val2);
 // int  ans=max(Val,max(val1,val2));
    if(ans<0)
    return -1;
    else
    return ans+1;
   
    
}
int main(){
    int n,a,b,c;
    cin>>n>>a>>b>>c;
    cout<<fun(n,a,b,c);
    
}