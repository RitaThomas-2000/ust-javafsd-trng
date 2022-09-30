var global_num=12;
class Numbers1{
    num_val=13;
    static sval=10;
    storeNum():void{
        var local_num=14;
    }
}
console.log("Global num:"+global_num)
console.log(Numbers1.sval);
var obj=new Numbers1();
console.log("Global num: "+obj.num_val);