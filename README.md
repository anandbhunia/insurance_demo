# insurance_demo
Practice project for Insurance Domain

![policy er](https://github.com/anandbhunia/insurance_demo/assets/26487497/2df79b64-90ba-449a-a3a1-7424c02946ec)

Problem statements
1. Design the entity classes as per the ER diagram considering the relationships

Design Repository, Service and Service implementation and Controller as per the below requirements.
All APIs must return data with proper http status and if there are any errors it should return proper error message

2. Design APIs to create, update, delete, get all and get one category with uri
   1. post /category to create category
   2. put /category/id to update category
   3. delete /category/id to delete one category
   4. get /category/id to get one category
   5. get /category to get all the categories, here implement pagination where one page contains 10 records with sorting by name

3. Design APIs to create, update, delete, get and get all Clients, the payload will contain the client details and the address details where client an address has 1-1 relationship
   1. Post /client to create the client
   2. Put /client/ID to update the client
   3. Delete / client slash ID to delete the client
   4. Get /client/ID to get one client
   5. Get /client to get all the clients, here implement pagination where one page contains 15 records, with sorting by name

4. Design APIs to create, update, delete, get one and all policy, many policies have one category
   1. Post / policy to create policy, here you need to provide category object
   2. Post / category / ID / policy, To create multiple policies under specific category, here ID is category ID
   3. Update / policy / ID to update policy
   4. Delete / policy / ID To delete the policy
   5. Get / policy / ID To get one policy
   6. Get / category / ID / policy To get the list of policies under that category, Implement pagination where one page contains 10 records
   7. Get / policy To get the list of policies,  implement pagination where one page contains 15 records

5. Design APIs to create, update, delete, get one and all Acquired policy
   1. Post / acquiredPolicy to create policy, here you need to provide here you need to provide client object, policy object and nominee object in the payload
   2. Post / policy / ID / policy, To create AcquiredPolicy  under specific Policy, here ID is Policy ID
   3. Update / acquiredPolicy / ID to update acquiredPolicy
   4. Delete / acquiredPolicy / ID To delete the acquiredPolicy
   5. Get / acquiredPolicy / ID To get one acquiredPolicy
   6. Get / client / ID / policy To get the list of policies client has, Implement pagination where one page contains 10 records
   7. Get / acquiredPolicy To get the list of acquiredPolicies,  implement pagination where one page contains 15 records
