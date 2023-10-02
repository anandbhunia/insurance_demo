# insurance_demo
Practice project for Insurance Domain

![policy er](https://github.com/anandbhunia/insurance_demo/assets/26487497/2df79b64-90ba-449a-a3a1-7424c02946ec)

Problem statements
1. Design the entity classes as per the ER diagram considering the relationships

Design Repository, Service and Service implementation and Controller as per the below requirements.
All APIs must return data with proper http status and if there are any errors it should return proper error message

2. Design APIs to create, update, delete, get all and get one category with uri
   post /category to create category
   put /category/id to update category
   delete /category/id to delete one category
   get /category/id to get one category
   get /category to get all the categories, here implement pagination where one page contains 10 records with sorting by name

3. Design APIs to create, update, delete, get and get all Clients, the payload will contain the client details and the address details where client an address has 1-1 relationship
   Post /client to create the client
   Put /client/ID to update the client
   Delete / client slash ID to delete the client
   Get /client/ID to get one client
   Get /client to get all the clients, here implement pagination where one page contains 15 records, with sorting by name

4. Design APIs to create, update, delete, get one and all policy, many policies have one category
   Post / policy to create policy, here you need to provide category object
   Post / category / ID / policy, To create multiple policies under specific category, here ID is category ID
   Update / policy / ID to update policy
   Delete / policy / ID To delete the policy
   Get / policy / ID To get one policy
   Get / category / ID / policy To get the list of policies under that category, Implement pagination where one page contains 10 records
   Get / policy To get the list of policies,  implement pagination where one page contains 15 records

5. Design APIs to create, update, delete, get one and all Acquired policy
   Post / acquiredPolicy to create policy, here you need to provide here you need to provide client object, policy object and nominee object in the payload
   Post / policy / ID / policy, To create AcquiredPolicy  under specific Policy, here ID is Policy ID
   Update / acquiredPolicy / ID to update acquiredPolicy
   Delete / acquiredPolicy / ID To delete the acquiredPolicy
   Get / acquiredPolicy / ID To get one acquiredPolicy
   Get / client / ID / policy To get the list of policies client has, Implement pagination where one page contains 10 records
   Get / acquiredPolicy To get the list of acquiredPolicies,  implement pagination where one page contains 15 records
