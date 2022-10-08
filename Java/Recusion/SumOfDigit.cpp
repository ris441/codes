#include<bits/stdc++.h>
using namespace std ;
#define ll long long
#define mod 1000000007
int  digitsum(int n, int sum ){
if(n==0){
//   cout<<sum<<endl ;

    return sum ;
}
sum+=n%10;
return digitsum(n/10,sum);
}
int digitsum1(int n){
    if(n==0){
        return 0;
    }
    return n%10 + digitsum1(n/10);
    }
int main(){
ll t;
cin>>t;
int sum =0;
cout<<digitsum(t,sum)<<endl;
cout<<digitsum1(t);
return 0;
}