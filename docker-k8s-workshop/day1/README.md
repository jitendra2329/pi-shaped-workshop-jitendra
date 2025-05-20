Core Concept Questions

**Why is Docker useful in building and deploying microservices for a real-world product (like an e-commerce or banking app)?**

Docker enables:

    Environment Consistency: Same runtime across dev, test, and production.

    Isolation: Services can run independently with their own dependencies.

    Portability: Easily move containers between machines or clouds.

    Faster CI/CD: Lightweight containers start quickly, speeding up pipelines.

    Scalability: Easy to replicate containers for load balancing.

In microservices architecture (like in banking/e-commerce apps), each service can be independently containerized, updated, scaled, and deployed without affecting others.

**What is the difference between a Docker image and a container in the context of scaling a web application?**

Docker Image	Blueprint for creating containers. Immutable and versionable. Think of it like a class in OOP.
Docker Container	A running instance of an image. Think of it like an object in OOP.

When scaling, you create multiple containers (instances) from a single image. For example, load balancers can distribute traffic across multiple containers spun from the same image.

**How does Kubernetes complement Docker when running a product at scale?**

Kubernetes helps manage containers at scale by providing:

    Orchestration: Automatically manages deployment, scaling, and operation of containers.

    Self-healing: Restarts failed containers, reschedules them, and replaces them when needed.

    Load balancing: Distributes traffic evenly across containers.

    Declarative Configuration: Describes desired state via YAML manifests.

    Auto-scaling: Increases/decreases pods based on CPU/memory metrics.