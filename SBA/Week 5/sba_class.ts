class Student{

    name:string;
    id:number;
    mark1:number;
    grade:string;

        constructor(mark1:number,grade:string){
            this.mark1=mark1;
            this.grade=grade;
        }

       
        check():void{

            for(var j=0;j<arr_names1.length;j++){
        
            if(obj2.mark1==arr_names1[j]){
        
                    cnt=1;
        
            }
        
        
        
            else{
        
                cnt=0;
        
            }
        
           
        
        }
        }
        




}
var cnt=0;

var arr_names1:number[]=new Array(4)



var obj2=new Student(50,"B");


obj2.check();



if(cnt==1){

    console.log("Mark present in array");

}

else{

    console.log("Mark not present in array");

}