var Student = /** @class */ (function () {
    function Student(mark1, grade) {
        this.mark1 = mark1;
        this.grade = grade;
    }
    Student.prototype.check = function () {
        for (var j = 0; j < arr_names1.length; j++) {
            if (obj2.mark1 == arr_names1[j]) {
                cnt = 1;
            }
            else {
                cnt = 0;
            }
        }
    };
    return Student;
}());
var cnt = 0;
var arr_names1 = new Array(4);
var obj2 = new Student(50, "B");
obj2.check();
if (cnt == 1) {
    console.log("Mark present in array");
}
else {
    console.log("Mark not present in array");
}
