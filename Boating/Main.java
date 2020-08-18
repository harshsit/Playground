#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int wt,a,c;
  cin>>wt>>a>>c;
  int b=(a*75)+(c*30);
  if(b<wt)
  {
     cout<<"Boat is stable"<<endl;
  }
  else{
    cout<<"Boat will drow"<<endl;
  }
}