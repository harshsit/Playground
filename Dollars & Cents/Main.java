#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int d1,c1,d2,c2,d,c;
  cin>>d1>>c1>>d2>>c2;
  
  if((c1+c2)>100){
    
    d=d1+d2+1;
    c=c1+c2-100;
    cout<<d<<endl;
    cout<<c<<endl;
  }
  else{
    
    d=d1+d2;
    c=c1+c2;
     cout<<d<<endl;
    cout<<c<<endl;
}
}