#include<iostream>
#include<string.h>
using namespace std;
struct student{
  char name[30];
  char dept[20];
  int year;
  float cgpa;
};

int main()
{
  int n;
  cout << "Enter the number of students";
  cin >> n;
  struct student s[20],t;
  for(int i=0 ; i<n ; i++){
    cout << "\nEnter the details of student " << (i+1);
    cout << "\nEnter name";
    cin >> s[i].name;
    cout << "\nEnter department";
    cin >> s[i].dept;
    cout << "\nEnter year of study";
  	cin >> s[i].year;
    cout << "\nEnter cgpa";
	cin >> s[i].cgpa;
  }
  for(int i=0 ; i<n ; i++){
    for(int j=i+1 ; j<n ; j++){
      if(strcmp(s[i].name,s[j].name) > 0){
        t = s[i];
        s[i] = s[j];
        s[j] = t;
      }
    }
  }
  cout << "\nDetails of students";
  for(int i=0 ; i<n ; i++){
    cout << "\nStudent " << (i+1);
    cout << "\nName:" << s[i].name;
    cout << "\nDepartment:" << s[i].dept;
    cout << "\nYear of study:" << s[i].year;
    cout << "\nCGPA:" << s[i].cgpa;
  }
}