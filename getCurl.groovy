def proc = "curl --location --request GET 'https://drlglobal.sharepoint.com/sites/HybridArch/DevSecOps/_api/web/lists/getbytitle('\''Configuration'\'')/items?$select=*&$top=100' \
--header 'Accept: application/json;odata=nometadata' \
--header 'Authorization: Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiIsIng1dCI6Im5PbzNaRHJPRFhFSzFqS1doWHNsSFJfS1hFZyIsImtpZCI6Im5PbzNaRHJPRFhFSzFqS1doWHNsSFJfS1hFZyJ9.eyJhdWQiOiIwMDAwMDAwMy0wMDAwLTBmZjEtY2UwMC0wMDAwMDAwMDAwMDAvZHJsZ2xvYmFsLnNoYXJlcG9pbnQuY29tQDZkMTQ2ODJiLTY4YTYtNGEyNS1hZjNkLTA2NjE1ZTE0NmIxZSIsImlzcyI6IjAwMDAwMDAxLTAwMDAtMDAwMC1jMDAwLTAwMDAwMDAwMDAwMEA2ZDE0NjgyYi02OGE2LTRhMjUtYWYzZC0wNjYxNWUxNDZiMWUiLCJpYXQiOjE2MTY0NzcwNTYsIm5iZiI6MTYxNjQ3NzA1NiwiZXhwIjoxNjE2NTYzNzU2LCJpZGVudGl0eXByb3ZpZGVyIjoiMDAwMDAwMDEtMDAwMC0wMDAwLWMwMDAtMDAwMDAwMDAwMDAwQDZkMTQ2ODJiLTY4YTYtNGEyNS1hZjNkLTA2NjE1ZTE0NmIxZSIsIm5hbWVpZCI6ImIzMzdmOTY0LTYzMjItNDY3NS1iNTQ1LWIzMGJjZTcxMzdjZkA2ZDE0NjgyYi02OGE2LTRhMjUtYWYzZC0wNjYxNWUxNDZiMWUiLCJvaWQiOiI5ZGZjZGM4NC0zNGE5LTRhMGQtYTdkNS0yYmQ5NjE1YWM0YjgiLCJzdWIiOiI5ZGZjZGM4NC0zNGE5LTRhMGQtYTdkNS0yYmQ5NjE1YWM0YjgiLCJ0cnVzdGVkZm9yZGVsZWdhdGlvbiI6ImZhbHNlIn0.nTEz0t5o0B_lUFPE9LlCz9zjrqZRDgp-84qkGBFsxSjMoLSDA61kaajbrbk-EYtuimXeX4t60TQFD7XE97PImY8DLgBrH8uzGxSG1ZUaqnCIA8Lhl1RejBEjCuTnf_ld6N3K9CicbguUiSQ9HO4V-poKFYtxlB2Bs7UK7kA12V4Uy27gcnLyYXTzHVeEGyIrKXNr_ZaAL7Eq2j9ITFAesU4KALFq0VPY-zZM1mRPCza7SwBK2tdP80MH3oPlgXGWXyESXGLiZLcy8AitlJtI9tNGfax7hr4jkrJ-57kM-l34EpCJYgGoa10iM5tWHKZlHKhP91Y5p2pNUgw0gJS__A'"
           .execute()
// cURL uses error output stream for progress output.
Thread.start { System.err << proc.err } 
// Wait until cURL process finished and continue with the loop.
proc.waitFor()



