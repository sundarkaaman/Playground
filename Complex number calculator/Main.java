#include<iostream>
//#include<math.h>
using namespace std;
struct complex{
  float rel;
  float img;
}s1,s2;
int main(){
  int op;
  cin >> op;
  float a, b;
  cin >> s1.rel >> s1.img;
  cin >> s2.rel >> s2.img;
  switch(op){
    case 1:
      a = (s1.rel)+(s2.rel);
      b = (s1.img)+(s2.img);
      cout << a << "+" << b << "i";
      break;
    case 2:
      a = (s1.rel)-(s2.rel);
      b = (s1.img)-(s2.img);
      cout << a << "+" << b << "i";
      break;
    case 3:
      a = (s1.rel)*(s2.rel) - (s1.img)*(s2.img);
      b = (s1.rel)*(s2.img) + (s2.rel)*(s1.img);
      cout << a << b << "i";
      //cout << "110-130i";
      break;
    default:
      cout << "Invalid choice";
      break;
  }
}