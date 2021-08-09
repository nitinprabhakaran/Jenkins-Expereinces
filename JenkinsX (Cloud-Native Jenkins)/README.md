JenkinsX is a cloud-native Jenkins Deployment on top of a Kubernetes Cluster to blend in cloud environments and also to support protability

Currently, JenkinsX only supports GitHub as an SCM tool and uses a tool called Prow (Another tool named Lighthouse can be used for other SCM Tool Integrations)

When Prow Triggers a pipeline, it uses an engine called Tekton, which is a k8s native pipeline engine 