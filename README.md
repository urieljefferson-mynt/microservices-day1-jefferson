# microservices-day1-jefferson

#README

#GCash Mini Microservices

#SERVICES
##Registration Service
    Request: user name, fullname, mobile number, email, address etc. [depending on account level]
    Response 200: Account created. 
    Verification code will be sent through email or sms

##Verification Service:
    Request: email, verification code
    Response 200: Account verified
    verification confirmed through email or sms. verified status in user database changed to True

##Add Money Service:
    Request: amount, userid
    Response 200: Money added successfully
    New entry created in transaction database of type: add_money

##Buy Items Service 
    Request: item id, userid
    Response 200: Item bought successfully
    New entry created in transaction database of type: buy_item

##Transfer Money Service
    Request: receiver user id, amount, userid
    Response 200: Succesfully transeferred to <receiver>
    New entry created in transaction database of type: transfer_money

#DATABASES
##User account Database:
    fields: string: user id
            string: username
            string: name
            string: email
            string: mobile 
            string: address
            date: birth date 
            boolean: is_verified

##User Billing Accounts:
            string: user id
            decimal: user balance


##User Billing Transactions Database:
            string: user id
            string: transaction type
            decimal: amount
            datetime: timestamp
            
