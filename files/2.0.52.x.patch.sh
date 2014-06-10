echo ""
echo "Cross-porting revision #26766..."
echo "svn cleanup..."
svn cleanup
echo "svn update..."
svn update
svn merge https://svn.merck.de/mocca/1-bruecke-phase2/trunk@26765 https://svn.merck.de/mocca/1-bruecke-phase2/trunk@26766
svn commit -m "[CROSS-PORT] revision #26766 from trunk (author s104147): A configuration parameter to enable or disable the eDynamics survey.
JIRA: BR-9468"
####################################################

echo ""
echo "Cross-porting revision #26792..."
echo "svn cleanup..."
svn cleanup
echo "svn update..."
svn update
svn merge https://svn.merck.de/mocca/1-bruecke-phase2/trunk@26791 https://svn.merck.de/mocca/1-bruecke-phase2/trunk@26792
svn commit -m "[CROSS-PORT] revision #26792 from trunk (author s104147): Dusbale survey in QA and prod, enable in devtest.
JIRA: BR-9468"
####################################################

echo ""
echo "Cross-porting revision #27299..."
echo "svn cleanup..."
svn cleanup
echo "svn update..."
svn update
svn merge https://svn.merck.de/mocca/1-bruecke-phase2/trunk@27298 https://svn.merck.de/mocca/1-bruecke-phase2/trunk@27299
svn commit -m "[CROSS-PORT] revision #27299 from trunk (author x153728): pgid and sid URL segments suppressed in redirect URLs generation
JIRA: BR-9846"
####################################################

echo ""
echo "Cross-porting revision #27305..."
echo "svn cleanup..."
svn cleanup
echo "svn update..."
svn update
svn merge https://svn.merck.de/mocca/1-bruecke-phase2/trunk@27304 https://svn.merck.de/mocca/1-bruecke-phase2/trunk@27305
svn commit -m "[CROSS-PORT] revision #27305 from trunk (author x153728): URL rewriting fix for category pages with extra parameters
JIRA: BR-9854"
####################################################

echo ""
echo "Cross-porting revision #27315..."
echo "svn cleanup..."
svn cleanup
echo "svn update..."
svn update
svn merge https://svn.merck.de/mocca/1-bruecke-phase2/trunk@27314 https://svn.merck.de/mocca/1-bruecke-phase2/trunk@27315
svn commit -m "[CROSS-PORT] revision #27315 from trunk (author x153728): fix for content pages URL rewriting regression
JIRA: BR-9854"
####################################################

