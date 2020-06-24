#Compute Tax

This program prompts the user for a customer name, purchase amount and tax code. It calculates the sales tax and returns the total amount due.


INPUT
    
    - Customer name
    - Purchase amount 
    - Taxcode
OUTPUT
    
    - Customer name
    - purchase amount 
    - sales tax
    - total amount Due

PROCESS 

BEGIN

Getting INPUT

    prompt user for name
    get customerName
    prompt user for purchase amount get purchaseAmount
    prompt user for tax code
    get taxCode
    
    Get Tax Rate
    if taxCode is 0 
        taxRate is 0%
    if taxCode is 1 
        taxRate is 3%
    if taxCode is 2 
        taxRate is 5%
    if taxCode is 3 
        taxRate is 7%

Calculations

    Compute salesTax
    multiply purchaseAmount by taxRate store result in salesTax

    Compute totalAmountDue
    add purchaseAmount to salesTax store result in totalAmountDue

OUTPUT
        
    display customerName 
    display purchaseAmount 
    display salesTax
    display totalAmountDue
END