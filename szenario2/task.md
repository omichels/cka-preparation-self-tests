## Using kubectl in imperative mode

speed is paramount in the CKA assessment test. Your task is to create a pod with these features:

- name: sleepingbeauty
- image: busybox
- command: while true; do sleep 5; done

Run this pod in a k8s through a **single** kubectl command. 


<details><summary>show solution</summary>
<p>



```
kubectl run sleepingbeauty --image=busybox --command -- sh -c 'while true; do sleep 5; done'
```

Reference

[kubectl run](https://kubernetes.io/docs/reference/generated/kubectl/kubectl-commands#run)


<p>
</details>


