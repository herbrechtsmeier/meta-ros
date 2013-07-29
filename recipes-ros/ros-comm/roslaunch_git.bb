DESCRIPTION = "roslaunch is a tool for easily launching multiple ROS nodes locally and remotely \
via SSH, as well as setting parameters on the Parameter Server."
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=16;endline=16;md5=d566ef916e9dedc494f5f793a6690ba5"
RDEPENDS_${PN} = "\
  coreutils \
  python-textutils \
  python-logging \
  python-threading \
  python-rospkg \
  rosgraph \
  python-pyyaml \
  roslib \
  rosclean \
  rosmaster \
  rosgraph-msgs \
    genpy \
    std-msgs \
  rosout \
"

require ros-comm.inc

S = "${WORKDIR}/git/tools/${BPN}"
