FROM centos/python-27-centos7 

ENV LD_LIBRARY_PATH=/opt/rh/python27/root/usr/lib64

USER root

RUN yum -y install epel-release \
    && yum -y install python-devel \
    && yum -y install python-pip \
    && pip install requests

WORKDIR /app
COPY . /app

CMD python sessions.py "' or 1--" \
    && python database_sessions.py "1 or customerid > 1" \
    && python register_sessions.py
