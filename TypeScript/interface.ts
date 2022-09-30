interface lPerson{
    firstName:string,
    lastName:string,
    sayHi:()=>string
}
var customer:lPerson={
    firstName:"Tom",
    lastName:"Hanks",
    sayHi:():string=>{return "Hi there"}
}
console.log("Customer Object ")
console.log(customer.firstName)
console.log(customer.lastName)
console.log(customer.sayHi())

var employee:lPerson={
    firstName:"Jim",
    lastName:"Blakes",
    sayHi:():string=>{return "Hello"}

}
console.log("Employee Object ")
console.log(employee.firstName)
console.log(employee.lastName)