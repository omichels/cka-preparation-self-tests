# Task 1


## Preparation

run the shell skript "prepare.sh". your kubectl config must be configured 
to use a k8s cluster. Use Minikube or Kind on your local machine.


## Task

Get a list of all k8s deployments in Namespace "sort"

The list must be sorted by the age (creation Time) of the deployment

Use "kubectl" for this task


<details><summary>show solution</summary>
<p>

```
kubectl -n sort get deployments --sort-by=.metadata.creationTimestamp
```

```
NAME       READY   UP-TO-DATE   AVAILABLE   AGE
afefaven   0/1     1            0           41s
anuwural   0/1     1            0           40s
acitojod   0/1     1            0           39s
osamarof   0/1     1            0           38s
uqakujov   0/1     1            0           37s
elucirid   0/1     1            0           35s
uxaqotaf   0/1     1            0           34s
ipefojib   0/1     1            0           33s
uhiqomoy   0/1     1            0           32s
avebecam   0/1     1            0           31s
icehomoq   0/1     1            0           30s
etimesub   0/1     1            0           29s
ofujalul   0/1     1            0           27s
obulusoc   0/1     1            0           26s
ofoyurow   0/1     1            0           25s
iyarinuh   0/1     1            0           24s
ukucokip   0/1     1            0           23s
ohorunuy   0/1     1            0           22s
ijisonav   0/1     1            0           20s
ubehefar   0/1     1            0           19s
```

</p>
</details>

