
process = [ "curl --location --request POST 'https://accounts.accesscontrol.windows.net/6d14682b-68a6-4a25-af3d-06615e146b1e /tokens/OAuth/2' \
--header 'Content-Type: application/x-www-form-urlencoded' \
--header 'Cookie: esctx=AQABAAAAAAD--DLA3VO7QrddgJg7Wevr6jLbx-K3QoF6aYQz67SaWeowC13UCOIXlrztvGCSN1hqE5s5xqg7qFuRPxjfP7_tkMB_Ab7HibK6yFlB--dRtL9B2VFup13yocSnr86_TJSEFAryhhoR1DhlHMn7fPKb9zhi1i7rjad6oIo60BVSu9ZX1vBi7xbPuvR3gbrRVnIgAA; x-ms-gateway-slice=estsfd; stsservicecookie=estsfd; fpc=Al_FpQ24IilOkTpz5hgcss0BGv5BAQAAALt469cOAAAA' \
--data-urlencode 'grant_type=client_credentials' \
--data-urlencode 'client_id=b337f964-6322-4675-b545-b30bce7137cf@6d14682b-68a6-4a25-af3d-06615e146b1e ' \
--data-urlencode 'client_secret=p+DLdqlYRWdECdoqT9xaULTknfA/zQ2tSSbh4q5kqnE=' \
--data-urlencode 'resource=00000003-0000-0ff1-ce00-000000000000/drlglobal.sharepoint.com@6d14682b-68a6-4a25-af3d-06615e146b1e '"].execute()
process.waitFor()
println process.err.text
println process.text