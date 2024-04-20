static void main(String[] args) {

  String changeString = "• Move set version to each componenct stage #build : aivis.bush@ugcs.com" + "\n• [UGCS-19578] Update vsm-ardupilot revision, ivy.xml edited online with Bitbucket #build : amotozov@ugcs.com" + "\n• [UGCS-18834] Reorder parameters: WP, Photogrammetery, Area Scan, Lidar etc : mbarabanova@ugcs.com"
  String changeString2 = "aivis.bush@ugcs.com"
  String changeString3 = "Too much text"
  String changeString4 = "No changes"

  findAuthors(changeString)

}

def findAuthors(String changeString) {
  String authors = ""

  def authorsList = changeString =~ /(\S+)@ugcs.com/
  while (authorsList.find()) {
    authors+="@" + authorsList.group(1) + ", "
  }

  if (!authors) authors = "team, "

  println ("Authors is: " + authors)
}