DESCRIPTION = "\
This unary stack contains the dynamic_reconfigure package which provides a means to change \
node parameters at any time without having to restart the node."

SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=5ee5b8b046ae48ad94a2037ca953a67b"

SRC_URI = "git://github.com/ros/${ROS_BPN}.git;branch=relocatable"
SRCREV = "b7b222534f7259ca457ea354d92c5708f895202e"
PV = "1.5.32+gitr${SRCPV}"

DEPENDS = "roscpp std-msgs roslib"
RDEPENDS_${PN} = "roslib"

S = "${WORKDIR}/git"

inherit catkin
