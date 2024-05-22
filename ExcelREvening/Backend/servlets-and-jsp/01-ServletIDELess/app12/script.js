function validateMyForm()
{
    var myForm = document.forms[0];
    var firstName = myForm.firstName;

    if(firstName.value.length == 0)
    {
        alert("Please enter the first name");
        firstName.focus();
        return false;
    }

    var myForm = document.forms[0];
    var lastName = myForm.lastName;

    if(lastName.value.length == 0)
    {
        alert("Please enter the last name");
        lastName.focus();
        return false;
    }
}