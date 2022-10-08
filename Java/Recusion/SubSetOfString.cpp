#include<bits/stdc++.h>
using namespace std ;
#define ll long long
#define mod 1000000007
void subSet(string str,string subset , int n){
  if(n==str.length()){
      cout<<subset<<endl;
        return;
    }
      subSet(str, subset+str[n], n+1);
       subSet(str,subset,n+1 );
    
   

}
int main(){
    subSet("ABC","",0 );

return 0;
}