class Student
{
    constructor(name, rollNo)
    {
        this.name = name;
        this.rollNo = rollNo;
    }
}
const student1 = new Student("vijay", 101);
// const student2 = new Student(102);
// student1 = new Student("kumar", 102);

document.write(student1.name + " " + student1.rollNo);