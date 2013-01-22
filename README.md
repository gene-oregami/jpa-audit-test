jpa-audit-test
==============

Minimal setup: JPA with hibernate, spring annotations, and most important: auditing of entities with envers

Sadly it doesn's work, if you start the JUnit test "TestSaveEntity" you get the following error:


org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'org.oregami.test.TestSaveEntity': Injection of autowired dependencies failed; nested exception is org.springframework.beans.factory.BeanCreationException: Could not autowire field: private org.oregami.jpa.IFirstEntityRepository org.oregami.test.TestSaveEntity.firstEntityRepository; nested exception is org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'iFirstEntityRepository': FactoryBean threw exception on object creation; nested exception is org.springframework.data.mapping.PropertyReferenceException: No property find found for type org.oregami.entities.FirstEntity
  at org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor.postProcessPropertyValues(AutowiredAnnotationBeanPostProcessor.java:288)
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.populateBean(AbstractAutowireCapableBeanFactory.java:1120)
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.autowireBeanProperties(AbstractAutowireCapableBeanFactory.java:379)
	at org.springframework.test.context.support.DependencyInjectionTestExecutionListener.injectDependencies(DependencyInjectionTestExecutionListener.java:110)
	at org.springframework.test.context.support.DependencyInjectionTestExecutionListener.prepareTestInstance(DependencyInjectionTestExecutionListener.java:75)
	at org.springframework.test.context.TestContextManager.prepareTestInstance(TestContextManager.java:313)
	at org.springframework.test.context.junit4.SpringJUnit4ClassRunner.createTest(SpringJUnit4ClassRunner.java:211)
	at org.springframework.test.context.junit4.SpringJUnit4ClassRunner$1.runReflectiveCall(SpringJUnit4ClassRunner.java:288)
	at org.junit.internal.runners.model.ReflectiveCallable.run(ReflectiveCallable.java:12)
	at org.springframework.test.context.junit4.SpringJUnit4ClassRunner.methodBlock(SpringJUnit4ClassRunner.java:284)
	at org.springframework.test.context.junit4.SpringJUnit4ClassRunner.runChild(SpringJUnit4ClassRunner.java:231)
	at org.springframework.test.context.junit4.SpringJUnit4ClassRunner.runChild(SpringJUnit4ClassRunner.java:88)
	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)
	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)
	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)
	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)
	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)
	at org.junit.internal.runners.statements.RunBefores.evaluate(RunBefores.java:26)
	at org.springframework.test.context.junit4.statements.RunBeforeTestClassCallbacks.evaluate(RunBeforeTestClassCallbacks.java:61)
	at org.springframework.test.context.junit4.statements.RunAfterTestClassCallbacks.evaluate(RunAfterTestClassCallbacks.java:71)
	at org.junit.runners.ParentRunner.run(ParentRunner.java:309)
	at org.springframework.test.context.junit4.SpringJUnit4ClassRunner.run(SpringJUnit4ClassRunner.java:174)
	at org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:50)
	at org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:38)
	at org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:467)
	at org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:683)
	at org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:390)
	at org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:197)
Caused by: org.springframework.beans.factory.BeanCreationException: Could not autowire field: private org.oregami.jpa.IFirstEntityRepository org.oregami.test.TestSaveEntity.firstEntityRepository; nested exception is org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'iFirstEntityRepository': FactoryBean threw exception on object creation; nested exception is org.springframework.data.mapping.PropertyReferenceException: No property find found for type org.oregami.entities.FirstEntity
	at org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor$AutowiredFieldElement.inject(AutowiredAnnotationBeanPostProcessor.java:514)
	at org.springframework.beans.factory.annotation.InjectionMetadata.inject(InjectionMetadata.java:87)
	at org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor.postProcessPropertyValues(AutowiredAnnotationBeanPostProcessor.java:285)
	... 27 more
Caused by: org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'iFirstEntityRepository': FactoryBean threw exception on object creation; nested exception is org.springframework.data.mapping.PropertyReferenceException: No property find found for type org.oregami.entities.FirstEntity
	at org.springframework.beans.factory.support.FactoryBeanRegistrySupport.doGetObjectFromFactoryBean(FactoryBeanRegistrySupport.java:149)
	at org.springframework.beans.factory.support.FactoryBeanRegistrySupport.getObjectFromFactoryBean(FactoryBeanRegistrySupport.java:102)
	at org.springframework.beans.factory.support.AbstractBeanFactory.getObjectForBeanInstance(AbstractBeanFactory.java:1443)
	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:249)
	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:194)
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.findAutowireCandidates(DefaultListableBeanFactory.java:873)
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.doResolveDependency(DefaultListableBeanFactory.java:815)
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.resolveDependency(DefaultListableBeanFactory.java:730)
	at org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor$AutowiredFieldElement.inject(AutowiredAnnotationBeanPostProcessor.java:486)
	... 29 more
Caused by: org.springframework.data.mapping.PropertyReferenceException: No property find found for type org.oregami.entities.FirstEntity
	at org.springframework.data.mapping.PropertyPath.<init>(PropertyPath.java:74)
	at org.springframework.data.mapping.PropertyPath.create(PropertyPath.java:326)
	at org.springframework.data.mapping.PropertyPath.create(PropertyPath.java:352)
	at org.springframework.data.mapping.PropertyPath.create(PropertyPath.java:306)
	at org.springframework.data.mapping.PropertyPath.from(PropertyPath.java:270)
	at org.springframework.data.mapping.PropertyPath.from(PropertyPath.java:244)
	at org.springframework.data.repository.query.parser.Part.<init>(Part.java:73)
	at org.springframework.data.repository.query.parser.PartTree$OrPart.<init>(PartTree.java:180)
	at org.springframework.data.repository.query.parser.PartTree$Predicate.buildTree(PartTree.java:260)
	at org.springframework.data.repository.query.parser.PartTree$Predicate.<init>(PartTree.java:240)
	at org.springframework.data.repository.query.parser.PartTree.<init>(PartTree.java:68)
	at org.springframework.data.jpa.repository.query.PartTreeJpaQuery.<init>(PartTreeJpaQuery.java:57)
	at org.springframework.data.jpa.repository.query.JpaQueryLookupStrategy$CreateQueryLookupStrategy.resolveQuery(JpaQueryLookupStrategy.java:90)
	at org.springframework.data.jpa.repository.query.JpaQueryLookupStrategy$CreateIfNotFoundQueryLookupStrategy.resolveQuery(JpaQueryLookupStrategy.java:162)
	at org.springframework.data.jpa.repository.query.JpaQueryLookupStrategy$AbstractQueryLookupStrategy.resolveQuery(JpaQueryLookupStrategy.java:68)
	at org.springframework.data.repository.core.support.RepositoryFactorySupport$QueryExecutorMethodInterceptor.<init>(RepositoryFactorySupport.java:280)
	at org.springframework.data.repository.core.support.RepositoryFactorySupport.getRepository(RepositoryFactorySupport.java:148)
	at org.springframework.data.repository.core.support.RepositoryFactoryBeanSupport.getObject(RepositoryFactoryBeanSupport.java:125)
	at org.springframework.data.repository.core.support.RepositoryFactoryBeanSupport.getObject(RepositoryFactoryBeanSupport.java:41)
	at org.springframework.beans.factory.support.FactoryBeanRegistrySupport.doGetObjectFromFactoryBean(FactoryBeanRegistrySupport.java:142)
	... 37 more

