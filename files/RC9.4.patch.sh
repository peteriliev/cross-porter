echo ""
echo "Cross-porting revision #8678..."
echo "svn cleanup..."
svn cleanup
echo "svn update..."
svn update
svn merge https://svn.javelingroup.com/svn/arp/trunk@8677 https://svn.javelingroup.com/svn/arp/trunk@8678
svn commit -m "[CROSS-PORT] revision #8678 from trunk (author danailp): ARP-6592 Add 'My billing address is the same as my delivery address' storefront config
JIRA: ARP-6592"
####################################################

echo ""
echo "Cross-porting revision #8690..."
echo "svn cleanup..."
svn cleanup
echo "svn update..."
svn update
svn merge https://svn.javelingroup.com/svn/arp/trunk@8689 https://svn.javelingroup.com/svn/arp/trunk@8690
svn commit -m "[CROSS-PORT] revision #8690 from trunk (author danailp): ARP-6592 Add 'My billing address is the same as my delivery address' storefront config (Grunt compiled app.js)
JIRA: ARP-6592"
####################################################

