# flowable-models-publish-to-git

## About
This project is meant to be a standalone maven package for a Flowable Design Spring Boot app. The purpose of this module is to commit Revision Publishes to a configured git repository by leveraging the `RestInterceptor` pattern from Flowable.

Ex., When you publish a revision to Flowable Work from Flowable Design (with this module included), your .zip file will go through the following process :
1) Flowable Design will clone/update the configured repo onto the filesystem where running
2) Checkout/create a branch that has the pattern `<appKey>/<revisionKey>` (defined in FlowApp)
3) Write the zip file inside a directory that matches the `appKey` from the app revision
4) unzip the zip file and write all model files to `<appKey>/models` directory of the local repo
5) Delete model files not present in published .zip but present in repo (##TO-DO) 
6) stage all changes 
7) Commit changes with commit message that matches the revision description given in the Flowable Design UI at the time the revision was taken
8) Push changes to remote
9) Open MR/PR, if not already open (##TO-DO)
10) Checkout main/master/configured base branch on local
11) publish original .zip file to Flowable Work

![alt text](https://github.com/abretz-mimacom/flowable-models-publish-to-git/blob/main/assests/revision.png)

![alt text](https://github.com/abretz-mimacom/flowable-models-publish-to-git/blob/main/assests/MR.png)