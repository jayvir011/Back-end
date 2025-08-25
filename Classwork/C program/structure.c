#include <stdio.h>
#include<string.h>
// Define a structure
struct Student {
    int roll_no;
    char name[50];//char khalii ek j word store kari sake word store kara mate string vaparay
    float marks;
};

int main() {
    // Declare a structure variable
    struct Student s1;

    // Assign values
    s1.roll_no = 1;
    strcpy(s1.name, "Rahul");//word save karva mate strcpy usse karay
    s1.marks = 85.5;

    // Print values
    printf("Roll No: %d\n", s1.roll_no);
    printf("Name: %s\n", s1.name);
    printf("Marks: %.2f\n\n\n", s1.marks);


     // Declare a structure variable
    struct Student s2;

    // Assign values
    s1.roll_no = 2;
    strcpy(s1.name, "jay");
    s1.marks = 85.5;

    // Print values
    printf("Roll No: %d\n", s1.roll_no);
    printf("Name: %s\n", s1.name);
    printf("Marks: %.2f\n", s1.marks);

    return 0;
}
