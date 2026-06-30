# Documentation Index

**Project:** Antenna  
**Status:** Pre-Alpha / Planning  
**Version:** 0.1  
**Last Updated:** 30 June 2026

## Purpose

This index defines how Antenna's documentation is structured, what each document is responsible for, and how contributors should maintain the documentation over time.

Antenna is being established as a documentation-first project. Documentation is therefore not an afterthought. It is the source of product scope, architectural direction, implementation expectations, and contribution standards until implementation begins.

## Source basis

This professional rewrite is based on the numbered project documents supplied for Antenna:

```text
01_vision.md
02_project_principles.md
03_scope_of_works.md
04_functional_requirements.md
06_decision_log.md
07_UI_UX_specification.md
08_architecture.md
```

The missing `05_non_functional_requirements.md` has been created because the scope, principles, functional requirements, and architecture already imply a substantial non-functional requirement set.

The unnumbered README and archive were not used as source material for the rewrite after the instruction to use the numbered files only.

## Documentation hierarchy

Antenna's documentation is organised into four layers:

1. **Project identity and purpose:** vision, mission, objectives, principles.
2. **Product definition:** scope, requirements, user journeys, UI/UX, roadmap.
3. **Engineering definition:** architecture, data, privacy, testing, release, decisions.
4. **Governance:** contribution process, decision records, risks, changelog, security, licensing.

## Document responsibilities

| Document | Responsibility | Update trigger |
| --- | --- | --- |
| `README.md` | Public entry point and repository overview. | Any major change to scope, status, build process, or documentation structure. |
| `01_vision.md` | Long-term direction and success definition. | Major change in project purpose or target audience. |
| `02_project_principles.md` | Decision principles and project motto. | Change in product philosophy or engineering standards. |
| `03_scope_of_works.md` | Version 1 scope, out-of-scope items, deliverables, definition of done. | Any scope addition, removal, or material redefinition. |
| `04_functional_requirements.md` | What the application must do. | Feature change or user-facing behaviour change. |
| `05_non_functional_requirements.md` | Quality attributes and constraints. | Changes to performance, privacy, reliability, accessibility, testing, or security expectations. |
| `06_decision_log.md` | Accepted/rejected/superseded decisions. | Any significant product, architecture, privacy, policy, or process decision. |
| `07_ui_ux_specification.md` | Navigation and interface behaviour. | Change in screen structure, navigation, content states, or interaction behaviour. |
| `08_architecture.md` | Technical architecture and module boundaries. | Change in platform, architecture, module structure, data flow, or dependency approach. |
| `09_product_requirements_document.md` | Product-level PRD for planning and alignment. | Change in target user, release objective, or business/product framing. |
| `10_user_stories_and_journeys.md` | User stories and acceptance criteria. | Feature change or new user flow. |
| `11_data_privacy_security.md` | Data, privacy, permissions, security, and storage expectations. | Any new data type, permission, integration, or storage location. |
| `12_accessibility_requirements.md` | Accessibility requirements and review checks. | UI, navigation, media, or content presentation change. |
| `13_testing_strategy.md` | Manual and automated test strategy. | New feature area, platform support change, or release process change. |
| `14_release_and_versioning.md` | Versioning, release phases, and release checklist. | Change in release process or project maturity. |
| `15_reddit_compatibility_and_policy.md` | Compatibility and policy-safe access boundaries. | Reddit access method, API terms, or platform behaviour change. |
| `16_open_questions_risks_assumptions.md` | Active unknowns and project risks. | New uncertainty, risk, or resolved assumption. |
| `17_requirements_traceability_matrix.md` | Traceability across documents and implementation. | Requirement change, test change, or architecture change. |
| `18_roadmap.md` | Milestones and release sequencing. | Delivery milestone change. |
| `19_glossary.md` | Shared terminology. | New term or terminology change. |
| `20_implementation_backlog.md` | Implementation-ready epics and tasks. | Start of development phase or backlog reprioritisation. |
| `21_documentation_audit.md` | Documentation rewrite audit trail. | Major documentation restructure. |

## Documentation standards

All documentation should use:

- Clear headings.
- Consistent naming.
- Requirement IDs where applicable.
- Plain language for user-facing concepts.
- Precise language for engineering decisions.
- Explicit status for draft, proposed, accepted, deprecated, or superseded content.
- Traceability for significant requirements and decisions.

## Requirement language

Antenna documentation uses the following requirement language:

- **Shall:** mandatory requirement.
- **Should:** expected requirement that may be adjusted with justification.
- **May:** optional, conditional, or future-consideration item.
- **Must not:** explicit prohibition.

## Decision records

Significant project decisions must be recorded in the decision log. A decision is significant if it affects:

- Version 1 scope.
- Platform support.
- Reddit compatibility.
- Architecture.
- Privacy posture.
- Data storage.
- Permissions.
- User experience.
- External dependencies.
- Release process.
- Contributor expectations.

Use the ADR template in `docs/adr/ADR-000-template.md` for new decisions.

## Documentation maintenance rule

When changing one document, check whether related documents also need to change. For example:

- Adding a new feature affects scope, functional requirements, UI/UX, architecture, tests, roadmap, and traceability.
- Adding a permission affects scope, non-functional requirements, privacy/security, UI settings, and documentation.
- Adding account login affects scope, functional requirements, architecture, Reddit compatibility, privacy, security, testing, and user documentation.

## Publishing rule

The documentation may be public before the app is complete, but it should not misrepresent project maturity. Until implementation exists, documents should clearly state that the project is in pre-alpha planning.
